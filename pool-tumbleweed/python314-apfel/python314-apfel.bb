SUMMARY = "A Probability Distribution Function Evolution Library"
DESCRIPTION = "APFEL is a library to perform the combined QCD+QED DGLAP \
evolution of parton distributions."
LICENSE = "GPL-3.0-or-later"

PV = "3.1.1"

RPM_NAME = "python314-apfel-3.1.1-2.15.aarch64.rpm"
RPM_HASH = "b73266f3e3ec382f843de4433340a653a6f5cf57ca7d0f499c85b7399b773b158c4421263db63159bd899202a4bbf29d4cc864c7cb4379c39f0cf5da0d2a0330"

RPROVIDES:${PN} += "python3.14dist-apfel \
python314-apfel \
python3dist-apfel"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libAPFEL.so.0.0.0 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
python-abi \
python314-LHAPDF \
update-alternatives"

inherit rpm
