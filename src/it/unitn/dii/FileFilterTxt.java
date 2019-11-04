package it.unitn.dii;

/*
 * I/O utilities - Copyright (C) 2017 by Damiano Martorelli
 *   
 * All rights reserved. Permission to use, copy, modify, and distribute this software is
 * freely granted, provided that this notice is preserved.
 *  
 * Original version by Damiano Martorelli
 */
/**
 * <p>
 * This class provides the filter for input/output of *.txt files.
 * </p>
 *
 * @author <a href="mailto:martorelli.damiano@gmail.com">Damiano Martorelli</a>
 * @version 1.1, January 10, 2017
 */
public class FileFilterTxt extends AbstractFileFilter
{
  /**
   * Class constructor standard.
   */
  public FileFilterTxt()
  {
    this.sDescription = "Text file";
    this.SFile_extension = ".txt";
  }
  
  /**
   * Class constructor where it is possible to personalize the description to be
   * showed in the FileChooser dialog.
   * 
   * @param new_description
   */
  public FileFilterTxt(String new_description)
  {
    this.sDescription = new_description;
    this.SFile_extension = ".txt";
  }
}