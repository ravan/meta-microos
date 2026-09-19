SUMMARY = "Metadata 'tagging' library based on TagLib"
DESCRIPTION = "pytaglib is an audio metadata (“tag”) library for Python. \
It relies on the TagLib C++ library."
LICENSE = "GPL-3.0-only | MIT"

PV = "3.2.0"

RPM_NAME = "python314-pytaglib-3.2.0-1.4.aarch64.rpm"
RPM_HASH = "133f622a48bb90d5e71031216fe33d8ce75e57e641a9ffa5cba7d691fda7b59393a6e4390212084f9c618c5f4263031ec475383bf3f565dfd1ec837f3bdbb63d"

RPROVIDES:${PN} += "python3.14dist-pytaglib \
python314-pytaglib \
python3dist-pytaglib"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
libtag.so.2 \
python-abi \
update-alternatives"

inherit rpm
