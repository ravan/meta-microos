SUMMARY = "Bytestructures for Guile"
DESCRIPTION = "This library offers a system imitating the type system of the C programming \
language, to be used on bytevectors within Guile."
LICENSE = "GPL-3.0-only"

PV = "1.0.10"

RPM_NAME = "guile-bytestructures-1.0.10-1.15.aarch64.rpm"
RPM_HASH = "27dfdce513433adcef75344a2eb8197c099ef6fc481fd64093652ea7c4d7cdcd038edf3c84de70835d0e0bf3514d260d92d8de8d85c6ec8848e3a1e12074dd04"

RPROVIDES:${PN} += "guile-bytestructures"

RDEPENDS:${PN} += "guile"

inherit rpm
