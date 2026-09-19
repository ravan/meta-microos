SUMMARY = "CLI tool that can help you to manage cert-manager resources inside your cluster"
DESCRIPTION = "cmctl is a CLI tool that can help you to manage cert-manager resources inside \
your cluster. \
While also available as a kubectl plugin, it is recommended to use as a stand \
alone binary as this allows the use of command auto-completion."
LICENSE = "Apache-2.0"

PV = "2.5.0"

RPM_NAME = "cmctl-2.5.0-1.4.aarch64.rpm"
RPM_HASH = "7368b4337468f52e1c0dbf3de8f77ac03aeb2b1da3a9f1655ab5a20621245dc52de7c2a072436b706a2bcb89d32b3b49b86b06ca1bcd61aa47db7076ddf2b80f"

RPROVIDES:${PN} += "cmctl"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
