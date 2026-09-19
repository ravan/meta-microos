SUMMARY = "GNU Emacs-nox: Emacs Lisp native compiled binary files"
DESCRIPTION = "Emacs Lisp (Elisp) is the Lisp dialect used by the Emacs text editor \
family. GNU Emacs can currently execute Elisp code either interpreted \
or byte-interpreted after it has been compiled to byte-code. \
The native compiler employs the byte-compiler's internal representation \
as input and exploits libgccjit to achieve code generation using the GNU \
Compiler Collection (GCC) infrastructure. Generated executables are stored \
as binary files and can be loaded and unloaded dynamically."
LICENSE = "GPL-3.0-or-later"

PV = "31.1"

RPM_NAME = "emacs-eln-31.1-3.1.aarch64.rpm"
RPM_HASH = "fce600f80098091fb5374fed2fea344a51ce1d82e5648abc6bc6239ab1d8ed42e74f31ee37f2228424d3b4bef35cd5d673962d8a2f5bcc75b577e47919797a38"

RPROVIDES:${PN} += "emacs-eln"

RDEPENDS:${PN} += "emacs-el \
libc.so.6"

inherit rpm
