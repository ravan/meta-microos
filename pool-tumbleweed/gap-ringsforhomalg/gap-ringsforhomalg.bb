SUMMARY = "GAP: Dictionaries of External Rings"
DESCRIPTION = "The RingsForHomalg package provides small dictionaries for homalg to \
speak (as much as needed of) the languages of Singular, Macaulay2, \
MAGMA, Sage, and Maple."
LICENSE = "GPL-2.0-only"

PV = "2026.05.01"

RPM_NAME = "gap-ringsforhomalg-2026.05.01-1.2.noarch.rpm"
RPM_HASH = "3077b8c41f42f9c7ddda8bbe7ceb002b0301b9cf4e7e2a4a6b077b5cbb22837bf338bd4ee7c39811256492bcd56fcf9114125303df3b39338f0571adf7108590"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gap-ringsforhomalg"

RDEPENDS:${PN} += "/usr/bin/sh \
gap-core \
gap-gapdoc \
gap-gaussforhomalg \
gap-homalgtocas \
gap-matricesforhomalg"

inherit rpm
