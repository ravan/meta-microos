SUMMARY = "Language server implementation for Zig in Zig"
DESCRIPTION = "Zig Language Server, or zls, is an unofficial language server for Zig."
LICENSE = "MIT"

PV = "0.15.0"

RPM_NAME = "zls-0.15.0-2.7.aarch64.rpm"
RPM_HASH = "67846314bcc2bcb253f427e6cb166c7a42b1adf3c225992b91b868bea0fd6998c90c0683c06f2271c9f028e36f8dd346e7e0142f79395cefb3a5245ef03e6c71"

RPROVIDES:${PN} += "zls"

RDEPENDS:${PN} += ""

inherit rpm
