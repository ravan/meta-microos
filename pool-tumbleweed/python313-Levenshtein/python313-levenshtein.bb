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

RPM_NAME = "python313-Levenshtein-0.27.1-1.9.aarch64.rpm"
RPM_HASH = "159d227492e342ab5c983e40df7ae4ba71da65d9ddc2fee53726d88b791ca164f3f3a203ac913afc9c162a644e5758000c93eac728c84cb5b0f39f909b680de1"

RPROVIDES:${PN} += "python3-Levenshtein \
python3.13dist-levenshtein \
python313-Levenshtein \
python3dist-levenshtein"

RDEPENDS:${PN} += "-python313-rapidfuzz >= 3.9.0 with python313-rapidfuzz < 4.0.0 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
python-abi"

inherit rpm
