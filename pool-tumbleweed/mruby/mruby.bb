SUMMARY = "Lightweight Ruby"
DESCRIPTION = "mruby is the lightweight implementation of the Ruby language complying to (part \
of) the ISO standard. \
 \
mruby can be linked and embedded within your application. \
 \
We provide the interpreter program 'mruby' and the interactive mruby shell \
'mirb' as examples. \
 \
You can also compile Ruby programs into compiled byte code using the mruby \
compiler 'mrbc'. \
 \
The 'mrbc' is also able to generate compiled byte code in a C source file."
LICENSE = "MIT"

PV = "4.0.0"

RPM_NAME = "mruby-4.0.0-1.1.aarch64.rpm"
RPM_HASH = "4f7978f3f3638cf487e66b9380ae0d0273a0eeceb0c007778dc29825c6fd0f04673bb5d496ede4ccc4d51b584458ec83ce5153276aca1d10b612aa576f1d2ed9"

RPROVIDES:${PN} += "mruby"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libmruby-core.so.4.0.0 \
libmruby.so.4.0.0"

inherit rpm
