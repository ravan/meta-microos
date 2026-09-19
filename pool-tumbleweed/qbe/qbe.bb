SUMMARY = "Small embeddable C compiler backend"
DESCRIPTION = "QBE is a compiler backend that aims to provide 70% of the performance of \
industrial optimizing compilers in 10% of the code.  QBE fosters language \
innovation by offering a compact user-friendly and performant backend. \
 \
The size limit constrains QBE to focus on the essential and prevents embarking \
on a never-ending path of diminishing returns."
LICENSE = "MIT"

PV = "1.3"

RPM_NAME = "qbe-1.3-1.2.aarch64.rpm"
RPM_HASH = "946726494eacc782c36163ab1a2b9ca4b01e1f3af2c60c4462c85f5fda03dcb4b7a7bf8782a210538b17d2a99044638e035bdddee77e9b251329f7b7b3944459"

RPROVIDES:${PN} += "qbe"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
