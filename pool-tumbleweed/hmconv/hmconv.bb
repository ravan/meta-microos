SUMMARY = "HangulCode Conversion Program"
DESCRIPTION = "HangulCode conversion program. \
 \
 \
 \
Authors: \
-------- \
    Jungshik Shin &lt;jshin@pantheon.yale.edu&gt;"
LICENSE = "SUSE-Public-Domain"

PV = "1.0pl5"

RPM_NAME = "hmconv-1.0pl5-673.36.aarch64.rpm"
RPM_HASH = "97fcea53513e52480bbe0f63afb1d8bd85d43660a16f446bef7e6ce9f0f0f40873cc81e44b922c75280fb56d2bc3d22b6ec6d06d0752914f21196c664e4a2248"

RPROVIDES:${PN} += "hmconv"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
