SUMMARY = "Tool for extracting metrics from application logs"
DESCRIPTION = "mtail is a tool for extracting metrics from application logs to be exported \
into a timeseries database or timeseries calculator for alerting and \
dashboarding."
LICENSE = "Apache-2.0"

PV = "3.0.0rc51"

RPM_NAME = "mtail-3.0.0rc51-5.13.aarch64.rpm"
RPM_HASH = "748300b354a25e09c6eb15e0be63d5436ef1937fdadf4632940ae335a2f50012b3b4dcfd73e3a165b8c1da72e264b74c080796b2c184cca841049a455b323f6e"

RPROVIDES:${PN} += "config-mtail \
group-mtail \
mtail \
user-mtail"

RDEPENDS:${PN} += "/usr/bin/mkdir \
/usr/bin/sh \
/usr/bin/touch \
fillup \
libc.so.6 \
shadow \
sysuser-shadow"

inherit rpm
