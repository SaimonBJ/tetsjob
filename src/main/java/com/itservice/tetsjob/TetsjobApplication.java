package com.itservice.tetsjob;
import com.itservice.tetsjob.view.ArrayView;
import com.itservice.tetsjob.view.MagicMatrixView;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Main class
 *
 * @version 1.0 16.12.2021
 * @author Semen Bogun
 */
@SpringBootApplication
public class TetsjobApplication {

	public static void main(String[] args) {
		SpringApplication.run(TetsjobApplication.class, args);


		//Start array test
		String[] arr1 = {"111","222","333"};
		String[] arr2 = {"222111","555222","221133"};

		ArrayView.viewArrayResult(arr1, arr2);

		//Start magic matrix test

		MagicMatrixView.viewMagicMatrix();

	}


}
