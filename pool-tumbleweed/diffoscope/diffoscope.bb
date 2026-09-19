SUMMARY = "In-depth comparison of files, archives, and directories"
DESCRIPTION = "diffoscope will try to get to the bottom of what makes files or \
directories different. It will recursively unpack archives of many kinds \
and transform various binary formats into more human readable form to \
compare them. It can compare two tarballs, ISO images, or PDF just as \
easily. \
 \
It can be scripted through error codes, and a report can be produced \
with the detected differences. The report can be text or HTML. \
When no type of report has been selected, diffoscope defaults \
to write a text report on the standard output. \
 \
diffoscope is developed as part of the `“reproducible builds” Debian \
project <https://wiki.debian.org/ReproducibleBuilds>`_. \
It is meant to be able to quickly understand why two builds of the same \
package produce different outputs. diffoscope was previously named \
debbindiff."
LICENSE = "GPL-3.0-or-later"

PV = "329"

RPM_NAME = "diffoscope-329-1.1.noarch.rpm"
RPM_HASH = "770adc0f161a0ddd06b27c45a99328086b3343ada71a5f85d60b1a4401e2fde72424c922f7ee07cf2030ed654f1c9a2ff4e08e0e8c7378f86abaa15415c700f1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "diffoscope \
python3.13dist-diffoscope \
python3dist-diffoscope"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
python-abi \
python3-curses \
python3-libarchive-c \
python3-python-magic \
update-alternatives"

inherit rpm
