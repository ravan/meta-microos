SUMMARY = "Platform-independent tool for Authenticode signing of EXE/CAB files"
DESCRIPTION = "osslsigncode is a small utility for placing signatures on Microsoft cabinate \
files and executables."
LICENSE = "GPL-3.0-only"

PV = "2.13"

RPM_NAME = "osslsigncode-2.13-1.3.aarch64.rpm"
RPM_HASH = "364b5d925d899fd9b47515e411071b46c0ebc2b9550a46388f8450de8a351b13d374073e9151b0fae121a4cb7c55460b03af47181668bf9897801a56be5eb39d"

RPROVIDES:${PN} += "osslsigncode"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libssl.so.3 \
libz.so.1"

inherit rpm
