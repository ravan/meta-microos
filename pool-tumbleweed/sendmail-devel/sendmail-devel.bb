SUMMARY = "BSD Sendmail Development Kit"
DESCRIPTION = "This package includes libraries and header files for building tools to \
access sendmail features. \
 \
'sendmail' is a trademark of Sendmail, Inc."
LICENSE = "Sendmail"

PV = "8.18.2"

RPM_NAME = "sendmail-devel-8.18.2-3.3.aarch64.rpm"
RPM_HASH = "76bee44bf5c9625d63355e92cfc91a50d418d4a75aac8ebffb77fda68be743b9e570418cef0f6f4de74da6866faf348b188d2a4bc0e1a3d75614bc415db5cef6"

RPROVIDES:${PN} += "sendmail-devel"

RDEPENDS:${PN} += "libmilter1-0"

inherit rpm
