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

RPM_NAME = "python314-translate-toolkit-3.19.9-1.2.noarch.rpm"
RPM_HASH = "03ec13251992c5bb835fd8751c7b5fa897dc98a43f7ef686c2401d4a595f59042bbca84d039d543583908007482ca7354ac9e2e8aa78ea3c82fbc1431b354436"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-translate-toolkit \
python314-translate-toolkit \
python3dist-translate-toolkit"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/python3.14 \
/usr/bin/sh \
alts \
gettext-runtime \
python-abi \
python314 \
python314-lxml \
python314-tomlkit \
python314-unicode-segmentation-rs"

inherit rpm
