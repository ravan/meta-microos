SUMMARY = "A program to generate language tag files used with various editors"
DESCRIPTION = "Universal ctags, a maintained fork from Darren Hieberts project, generates tag \
files from source code for various languages to be used with Editors like \
Emacs, Vim and several others."
LICENSE = "GPL-2.0-only"

PV = "6.2.1"

RPM_NAME = "universal-ctags-6.2.1-1.3.aarch64.rpm"
RPM_HASH = "8fc5eb5c35da630afb64fd1db0952477ea5589c6c2b807b230958bb943d5bcc1396e6c41cd00dd906d887cb7132510cd068b97a29c0f8e386e0199161b2d625d"

RPROVIDES:${PN} += "universal-ctags"

RDEPENDS:${PN} += "alts \
ld-linux-aarch64.so.1 \
libc.so.6 \
libjansson.so.4 \
libpcre2-8.so.0 \
libseccomp.so.2 \
libyaml-0.so.2"

inherit rpm
