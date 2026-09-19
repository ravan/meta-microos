SUMMARY = "Linux Trace Toolkit Userspace Tracer Documentation"
DESCRIPTION = "This package includes documentation and examples for developing \
applications using LTTng userspace tracing."
LICENSE = "GPL-2.0-only"

PV = "2.14.0"

RPM_NAME = "lttng-ust-doc-2.14.0-1.3.noarch.rpm"
RPM_HASH = "e27373280e4a7cae1f95f049db969ceb4a14576694ba42a3e53bd5f2fca5d5ed25198eb47a7b17a3d89e93f5da5aba46dd1c05239dcb21126430df1498963c93"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lttng-ust-doc \
lttng-ust-docs"

RDEPENDS:${PN} += "liblttng-ust-ctl6 \
liblttng-ust-python-agent1 \
liblttng-ust1"

inherit rpm
