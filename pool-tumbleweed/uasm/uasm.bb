SUMMARY = "MASM-compatible assembler based on JWasm"
DESCRIPTION = "MASM-compatible assembler based on JWasm"
LICENSE = "Watcom-1.0"

PV = "2.57r"

RPM_NAME = "uasm-2.57r-3.5.aarch64.rpm"
RPM_HASH = "39c121336d0ecef210aaf8871f79bacea9db71e618806198e4ad21180e1f57fedcbf19a47cab6cce64828d00cdff3af9b6d642a53bd89881abdc47e809146fdb"

RPROVIDES:${PN} += "uasm"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
