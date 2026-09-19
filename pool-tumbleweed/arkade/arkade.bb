SUMMARY = "Open Source Kubernetes Marketplace"
DESCRIPTION = "arkade provides a portable marketplace for downloading your favourite devops \
CLIs and installing helm charts, with a single command.  You can also download \
CLIs like kubectl, kind, kubectx and helm faster than you can type \
'apt-get/brew update'."
LICENSE = "Apache-2.0"

PV = "0.11.125"

RPM_NAME = "arkade-0.11.125-1.1.aarch64.rpm"
RPM_HASH = "85a34d07ffacee3ccaf66a6179df3354da7be95e34bb34a1fc952eefe055598799d4137becb4fa8884f2c4b7ea679d2756991cba517b213af71c97514cc3e49f"

RPROVIDES:${PN} += "arkade"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
