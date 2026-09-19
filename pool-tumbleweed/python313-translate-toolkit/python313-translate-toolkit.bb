SUMMARY = "Tools and API to assist with translation and software localization"
DESCRIPTION = "The Translate Toolkit is a set of software and documentation designed to help \
make the lives of localizers both more productive and less frustrating. \
 \
The software includes programs to convert localization formats to the common \
PO, and emerging XLIFF format.  There are also programs to check and manage PO \
and XLIFF files.  Online documentation includes guides on using the tools, \
running a localization project and how to localize various projects from \
OpenOffice.org to Mozilla. \
 \
At its core the software contains a set of classes for handling various \
localization storage formats: DTD, properties, OpenOffice.org GSI/SDF, \
CSV, MO, Qt .ts, TMX, TBX, WordFast txt, Gettext .mo, Windows RC, and \
of course PO and XLIFF.  It also provides scripts to convert between \
these formats. \
 \
Also part of the Toolkit are Python programs to create word counts, merge \
translations and perform various checks on translation files."
LICENSE = "GPL-2.0-or-later"

PV = "3.19.9"

RPM_NAME = "python313-translate-toolkit-3.19.9-1.2.noarch.rpm"
RPM_HASH = "94c17ce889bd563c4d83ea70aa519c85da6383a27c9edbf1103130ae4e113ee43db291a2bbf48db6ca34a9f975a35d478e4367dded7bd14568d3f34e0a26220c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-translate-toolkit \
python3.13dist-translate-toolkit \
python313-translate-toolkit \
python3dist-translate-toolkit \
translate-toolkit"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/python3.13 \
/usr/bin/sh \
alts \
gettext-runtime \
python-abi \
python313 \
python313-lxml \
python313-tomlkit \
python313-unicode-segmentation-rs"

inherit rpm
