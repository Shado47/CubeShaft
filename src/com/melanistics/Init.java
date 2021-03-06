package com.melanistics;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

public class Init {
	@Documented
	@Retention(value = RetentionPolicy.RUNTIME)
	@Target(value = { ElementType.METHOD })
	public @interface Start {
	}

	@Documented
	@Retention(value = RetentionPolicy.RUNTIME)
	@Target(value = { ElementType.TYPE })
	public @interface Gui {
		public abstract int ID();

	}

	@Gui(ID = 0)
	public interface IInputHandler {
		public void onKeyInput(int par1, char par2, boolean par3);
	}

}
