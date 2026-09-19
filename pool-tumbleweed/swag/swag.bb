SUMMARY = "Automatically generate RESTful API documentation with Swagger 2.0 for Go"
DESCRIPTION = "Swag converts Go annotations to Swagger Documentation 2.0. We've created a \
variety of plugins for popular Go web frameworks. This allows you to quickly \
integrate with an existing Go project (using Swagger UI)."
LICENSE = "MIT"

PV = "1.16.6"

RPM_NAME = "swag-1.16.6-1.8.aarch64.rpm"
RPM_HASH = "123d6ebae24784a8eb9f8e300f3a8f586f3cebb14df1e2c76029841b015b670c1df303d092d701011b67f9cdc20d2ff99fca1ccd12bed4919ab059758427e33b"

RPROVIDES:${PN} += "swag"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
