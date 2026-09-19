SUMMARY = "Python extension computing string distances and similarities"
DESCRIPTION = "The Levenshtein Python C extension module contains functions for fast \
computation of \
 \
 * Levenshtein (edit) distance, and edit operations \
 * string similarity \
 * approximate median strings, and generally string averaging \
 * string sequence and set similarity \
 \
It supports both normal and Unicode strings."
LICENSE = "GPL-2.0-or-later"

PV = "0.27.1"

RPM_NAME = "python314-Levenshtein-0.27.1-1.9.aarch64.rpm"
RPM_HASH = "de153daf9559f9dc0c20f6a7ce984025168074f5369b2068f58ee9118e51714301393befd5584dd30ae7789701c9b98e896c46f8782e3b8ec9fe630139135b83"

RPROVIDES:${PN} += "python3.14dist-levenshtein \
python314-Levenshtein \
python3dist-levenshtein"

RDEPENDS:${PN} += "-python314-rapidfuzz >= 3.9.0 with python314-rapidfuzz < 4.0.0 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
python-abi"

inherit rpm
