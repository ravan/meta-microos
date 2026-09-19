SUMMARY = "Pulseaudio plugin for audaspace"
DESCRIPTION = "Audaspace (pronounced 'outer space') is a high-level audio library. \
This package contains the Pulseaudio plugin"
LICENSE = "Apache-2.0"

PV = "1.10.0"

RPM_NAME = "audaspace-plugin-pulse-1.10.0-1.1.aarch64.rpm"
RPM_HASH = "8ca53c5b7734d88a619e4409caba077d77ac42f764b9efe4df192779ba44af45320fc2e3510a105037596ee196c8d1fffb92b16ba11b488223824676812ea0d9"

RPROVIDES:${PN} += "audaspace-deviceplugin \
audaspace-plugin-pulse \
libaudpulseaudio.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libaudaspace.so.1.10 \
libc.so.6 \
libgcc-s.so.1 \
libpulse.so.0 \
libstdc++.so.6"

inherit rpm
