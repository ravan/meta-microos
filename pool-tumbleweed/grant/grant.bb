SUMMARY = "Search an SBOM for licenses and the packages they belong to"
DESCRIPTION = "View licenses for container images, SBOM documents, filesystems, and apply \
rules that help you build a license compliance report."
LICENSE = "Apache-2.0"

PV = "0.6.8"

RPM_NAME = "grant-0.6.8-1.2.aarch64.rpm"
RPM_HASH = "668d09e63be274d9913175256ce066369a3bec9721352fbfa27612a7fc7e9cb7108822682772d0c8f662956dc7fee63dc0bd18735345dda04fdfff8a8912eab1"

RPROVIDES:${PN} += "grant"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
