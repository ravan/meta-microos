SUMMARY = "League Of Movable Type's 'Sorts Mill Goudy' font family"
DESCRIPTION = "A 'revival' of Goudy Oldstyle and Italic, with features including \
small capitals (in the roman only), oldstyle and lining figures, \
superscripts and subscripts, fractions, ligatures, class-based \
kerning, case-sensitive forms, and capital spacing. There is support \
for many languages using Latin scripts."
LICENSE = "OFL-1.1"

PV = "0.20121218"

RPM_NAME = "lomt-sortsmillgoudy-fonts-0.20121218-8.15.noarch.rpm"
RPM_HASH = "a8274ae1fd52c5a13328dc4adcaa46d66c301cf093a0b9d0cdc5d5d2349b06f7ad109ffe8a94abe91ca754142cc0d78741921b37a75b5b325d7bcb852d384950"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lomt-sortsmillgoudy-fonts"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
