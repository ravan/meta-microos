SUMMARY = "Documentation for gnulib modules"
DESCRIPTION = "The GNU portability library is a macro system and C declarations and \
definitions for commonly-used API elements and abstracted system behaviors. \
It can be used to improve portability and other functionality in your programs. \
 \
This package contains documentation for gnulib."
LICENSE = "GFDL-1.3-only"

PV = "git.20260114.2a288c048e"

RPM_NAME = "gnulib-docs-git.20260114.2a288c048e-2.7.noarch.rpm"
RPM_HASH = "0943b4b4d11ff370768079c6784d899d008bab8274f4a3cabcdc35d53a4e0abe03b24b05d921d45c6294c30321f3460b9e336a17b642df0df58eecf0f89104f1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gnulib-docs"

RDEPENDS:${PN} += "/usr/bin/sh \
gnulib-devel \
info"

inherit rpm
