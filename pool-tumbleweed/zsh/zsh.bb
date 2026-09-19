SUMMARY = "Shell with comprehensive completion"
DESCRIPTION = "Zsh is a UNIX command interpreter (shell) that resembles the Korn shell \
(ksh). It is not completely compatible. It includes many enhancements, \
notably in the command-line editor, options for customizing its \
behavior, file name globbing, features to make C-shell (csh) users feel \
at home, and extra features drawn from tcsh (another `custom' shell). \
Zsh is well known for its command line completion."
LICENSE = "MIT"

PV = "5.9"

RPM_NAME = "zsh-5.9-12.7.aarch64.rpm"
RPM_HASH = "77202623e4be5862493c1e19567a0fa2c06f0a46a98a7469b313106ae93fae05c7ca055098a0ef790c7e8bf9d6098ce5995db521c5cf5022291ef195f845c3b4"

RPROVIDES:${PN} += "/usr/bin/zsh \
config-zsh \
zsh"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcap.so.2 \
libm.so.6 \
libncursesw.so.6 \
libpcre2-8.so.0 \
libtinfo.so.6"

inherit rpm
