SUMMARY = "SSH server auditing"
DESCRIPTION = "Utility to test the performance of interactive ssh sessions or scp file \
transfers. It uses ssh to log into a remote system, then runs two tests: the \
first test sends one character at a time, waiting for each character to be \
returned while it records the latency time for each. The second test sends a \
dummy file over scp to /dev/null on the remote system."
LICENSE = "MIT"

PV = "0.1.4+git20230317"

RPM_NAME = "sshping-0.1.4+git20230317-2.5.aarch64.rpm"
RPM_HASH = "ef6909394b54860ba1895935660b159d47c2ac7d3b61e785638907ceeb7f8c7ec0fdac63398fd15dd653cfce349e5cc29c7af7f98c9daaa423674096c8910de7"

RPROVIDES:${PN} += "sshping"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libssh.so.4 \
libstdc++.so.6"

inherit rpm
