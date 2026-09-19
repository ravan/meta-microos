SUMMARY = "Magnetic tape control"
DESCRIPTION = "The mt/smt program sends commands to a local or a remote magnetic \
tape drive."
LICENSE = "CDDL-1.0"

PV = "2024.03.21"

RPM_NAME = "schily-mt-2024.03.21-53.5.aarch64.rpm"
RPM_HASH = "02d124448cf3bb6c4f1026d7b10fb58063793dda43c559c13c1a70f61e4f6735afe893d349fc7a50b07c8b1c90777458f585ef9b1fede2800e22d1a77c416d14"

RPROVIDES:${PN} += "mt \
schily-mt \
star-rmt-/usr/bin/smt"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
librmt.so.1.0 \
libschily.so.2.0"

inherit rpm
