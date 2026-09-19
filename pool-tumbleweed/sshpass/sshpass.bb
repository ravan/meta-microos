SUMMARY = "Non-interactive SSH authentication utility"
DESCRIPTION = "Tool for non-interactively performing password authentication with so called \
'interactive keyboard password authentication' of SSH. Most users should use \
more secure public key authentication of SSH instead."
LICENSE = "GPL-2.0-or-later"

PV = "1.10"

RPM_NAME = "sshpass-1.10-2.3.aarch64.rpm"
RPM_HASH = "50753508f7f60ae9091dd7e301b214db313123fab582bf2667d4bca0d5a86ca6c72d6024c16779bfdf8b9009c116b21c77684c0cbdecd205b350093e19d2ceb4"

RPROVIDES:${PN} += "sshpass"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
