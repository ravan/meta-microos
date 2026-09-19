SUMMARY = "Python Tools for Computational Molecular Biology"
DESCRIPTION = "The Biopython Project is an international association of developers of freely \
available Python tools for computational molecular biology."
LICENSE = "BSD-3-Clause & MIT"

PV = "1.88"

RPM_NAME = "python314-biopython-1.88-1.1.aarch64.rpm"
RPM_HASH = "f76a5f5ed2680380a773ccce66a97f53593b05ba80fd066bb9173f90a196f12c9ce4c96fa3aa28a5310997edbd2684e9c2572709f99f9d970cbee4a3ccc90588"

RPROVIDES:${PN} += "python3.14dist-biopython \
python314-biopython \
python3dist-biopython"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi \
python314-numpy \
python314-xml"

inherit rpm
