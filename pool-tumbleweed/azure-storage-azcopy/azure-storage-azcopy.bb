SUMMARY = "Microsoft Azure Storage data transfer utility"
DESCRIPTION = "AzCopy v10 is a command-line utility that you can use to copy data to and from \
containers and file shares in Azure Storage accounts. AzCopy V10 presents \
easy-to-use commands that are optimized for high performance and throughput."
LICENSE = "MIT"

PV = "10.32.8"

RPM_NAME = "azure-storage-azcopy-10.32.8-1.1.aarch64.rpm"
RPM_HASH = "667cebca2317054d3a78cf65b9d9a69a83ff3135b6acd7df4118079780afe38de11c15766796f35431d141af13291033cd6c1e53456643c77921d8fb98101a9f"

RPROVIDES:${PN} += "azure-storage-azcopy"

RDEPENDS:${PN} += ""

inherit rpm
