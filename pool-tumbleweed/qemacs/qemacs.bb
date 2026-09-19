SUMMARY = "An editor similar to Emacs"
DESCRIPTION = "Full screen editor with an Emacs look and feel with common Emacs features \
like multi-buffer, multi-window, command mode, universal argument, \
keyboard macros, config file with C like syntax, minibuffer with \
completion and history. Additional features: \
 \
* UTF-8 support, including bidirectional editing respecting the \
  Unicode bidi algorithm. \
 \
* WYSIWYG HTML/XML/CSS2 mode graphical editing. Supports Lynx-like \
  rendering on VT100 terminals. \
 \
* A WYSIWYG DocBook mode based on XML/CSS2 renderer. \
 \
* C mode: coloring with immediate update. Emacs like auto-indent. \
 \
* Shell mode: colorized VT100 emulation so that shells work as \
  expected. Compile mode with next/prev error. \
 \
* Input methods for most languages, including Chinese (input methods \
  come from the Yudit editor). \
 \
* Hexadecimal editing mode with insertion and block commands. Unicode \
  hexa editing of UTF-8 files also supported. \
 \
* X11 support and support for multiple proportional fonts at the same \
  time (as XEmacs). X Input methods supported. Xft extension \
  supported for anti aliased font display."
LICENSE = "LGPL-2.1-or-later"

PV = "0.3.3"

RPM_NAME = "qemacs-0.3.3-3.5.aarch64.rpm"
RPM_HASH = "a5b3d1b7cbb4d65e9c14fd4cb5cea23b48cc7937ce5e563b4f0d79bdfcb4574a6e7f6a7e2eca80f457a935cd8d94ab7bbd387a77a1b5395f1818157f7833c5cd"

RPROVIDES:${PN} += "qemacs"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11.so.6 \
libXext.so.6 \
libXv.so.1 \
libc.so.6"

inherit rpm
