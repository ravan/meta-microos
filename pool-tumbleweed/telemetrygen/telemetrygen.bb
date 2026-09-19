SUMMARY = "Telemetry generator for OpenTelemetry"
DESCRIPTION = "This utility simulates a client generating traces, metrics, and logs. It is \
useful for testing and demonstration purposes."
LICENSE = "Apache-2.0"

PV = "0.158.0"

RPM_NAME = "telemetrygen-0.158.0-1.1.aarch64.rpm"
RPM_HASH = "1157c0e60cc45e66bfcdf1ddf173f0428f80b88331ec045aa4eb0002300a94e7a6e96054d43f2139a23e0af7d6c1f7bbaa1bd34d34f3a10c8a8c34d3be4f3a2b"

RPROVIDES:${PN} += "telemetrygen"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
