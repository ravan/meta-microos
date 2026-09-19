SUMMARY = "Easily install/upgrade between different versions of Zig"
DESCRIPTION = "Zig Version Manager (zvm) is a tool for managing your Zig installs. With std \
under heavy development and a large feature roadmap, Zig is bound to continue \
changing. Breaking existing builds, updating valid syntax, and introducing new \
features like a package manager. While this is great for developers, it also \
can lead to headaches when you need multiple versions of a language installed \
to compile your projects, or a language gets updated frequently."
LICENSE = "MIT"

PV = "0.8.27"

RPM_NAME = "zvm-0.8.27-1.1.aarch64.rpm"
RPM_HASH = "af70834758c9db8920a0594a2795c03044540dfed5762ee5fb2ec84f016b50b045d977e1f64e439237a533f5c4544fc35aa264875ff91a1c42dced9e48d8ff1e"

RPROVIDES:${PN} += "zvm"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
