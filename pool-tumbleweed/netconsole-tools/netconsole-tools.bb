SUMMARY = "Configure netconsole Kernel Module"
DESCRIPTION = "netconsole is a kernel feature to log the dmesg output via the network. \
The used network driver must support the polling function. \
 \
netconsole-server is a wrapper for insmod to load netconsole.o with the \
correct options. Use netcat on the client side to receive the kernel \
messages."
LICENSE = "SUSE-Public-Domain"

PV = "20030909"

RPM_NAME = "netconsole-tools-20030909-158.10.noarch.rpm"
RPM_HASH = "09bb429b7c4c50f2fe3e6b64145bfb14cef37d1ec98e0842ced86d108c6275d968ec38e38bf9e41c219b0a21b44c5ee20c4858116eef42290096ca4cc3ff8e11"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "netconsole-tools"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
