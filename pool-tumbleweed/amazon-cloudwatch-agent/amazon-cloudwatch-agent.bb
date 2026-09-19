SUMMARY = "Amazon CloudWatch Agent"
DESCRIPTION = "CloudWatch Agent enables you to collect and export host-level \
metrics and logs on instances running Linux or Windows server."
LICENSE = "MIT"

PV = "1.300071.0"

RPM_NAME = "amazon-cloudwatch-agent-1.300071.0-2.1.aarch64.rpm"
RPM_HASH = "279f37e612e7759f7abb9c20327bb91bac12269c80238a9b8d3aa233ff3addebba3e4c8a90c0eb57e65deddb3cc94bff682789eb85883d5973468fec0ff3a43b"

RPROVIDES:${PN} += "amazon-cloudwatch-agent"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
