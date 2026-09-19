SUMMARY = "Description of Finnish morphology written for libvoikko"
DESCRIPTION = "Voikko-fi (previously known as suomi-malaga) is a description of Finnish \
morphology written for libvoikko. \
 \
This package contains a compiled version of Voikko-fi using the new \
unweighted VFST dictionary format. It is suitable for use in spell checking, \
grammar checking and hyphenation system Voikko, provided by the libvoikko \
library."
LICENSE = "GPL-2.0-or-later"

PV = "2.5"

RPM_NAME = "malaga-suomi-2.5-1.11.noarch.rpm"
RPM_HASH = "f3e82fe38069516c6690af349055e214c881b9c2efe7d5ae08dda1d26226eb71081d8798834c644c4bfc06c64f56a3b856866006ba3a0be94794531a9a3869a9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "malaga-suomi \
suomi-malaga \
voikko-fi"

RDEPENDS:${PN} += ""

inherit rpm
