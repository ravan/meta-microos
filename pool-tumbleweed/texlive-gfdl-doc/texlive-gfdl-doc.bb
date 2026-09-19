SUMMARY = "Documentation for texlive-gfdl"
DESCRIPTION = "This package includes the documentation for texlive-gfdl"
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.0.0.2svn75712"

RPM_NAME = "texlive-gfdl-doc-2026.226.0.0.2svn75712-60.2.noarch.rpm"
RPM_HASH = "393342bb778a6d6fe00ee93c8ca0e4afeee4af963690bdf5133ae96f33d2cb170251817d5b7736f9087a60536b3c929cb6664e53b720eb74c696a773ffd49b9f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-gfdl-doc"

RDEPENDS:${PN} += ""

inherit rpm
