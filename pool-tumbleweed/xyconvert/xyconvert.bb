SUMMARY = "GUI converter of files in formats supported by xylib"
DESCRIPTION = "GUI converter of files in formats supported by xylib: \
- plain text, delimiter-separated values (e.g. CSV) \
- Crystallographic Information File for Powder Diffraction (pdCIF) \
- Siemens/Bruker UXD \
- Siemens/Bruker RAW ver. 1/2/3 \
- Philips UDF \
- Philips RD (raw scan) V3 \
- Rigaku DAT \
- Sietronics Sieray CPI \
- DBWS/DMPLOT data file \
- Canberra CNF (from Genie-2000 software; aka CAM format) \
- Canberra AccuSpec MCA \
- XFIT/Koalariet XDD \
- RIET7/LHPM/CSRIET/ILL\\_D1A5/PSI\\_DMC DAT \
- Vamas ISO14976 \
  *(only experiment modes: SEM or MAPSV or MAPSVDP are supported; \
  only REGULAR scan_mode is supported)* \
- Princeton Instruments WinSpec SPE \
  *(only 1-D data is supported)* \
- χPLOT CHI_ \
- Ron Unwin's Spectra XPS format (VGX-900 compatible)"
LICENSE = "LGPL-2.1-or-later"

PV = "1.6"

RPM_NAME = "xyconvert-1.6-1.30.aarch64.rpm"
RPM_HASH = "b0bfb521aa9d69a49bb9fd28e6d30d05fe59c1cd3c72bd8a0d3e47f03986b51dad960f4cca31eb671d71dd6dcc161580d57300a31d2d09a67c4aff49c36b4d83"

RPROVIDES:${PN} += "xyconvert"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
libwx-baseu-suse.so.16.0.0 \
libwx-gtk2u-core-suse.so.16.0.0 \
libxy.so.3"

inherit rpm
