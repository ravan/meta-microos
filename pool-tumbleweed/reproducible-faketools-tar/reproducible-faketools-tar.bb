SUMMARY = "replacement tar"
DESCRIPTION = "a script to enhance the reproducibility of the output of tar \
by adding --sort and --mtime options"
LICENSE = "MIT"

PV = "0.5.5+0"

RPM_NAME = "reproducible-faketools-tar-0.5.5+0-1.7.noarch.rpm"
RPM_HASH = "1c41577f4defaedc57664cff7a7f4949fdb6900bf240454d46405594a2b6706bb2a3d349dcee913fec4a375d617db74f6ff08253fa49bb797f390c70a17af11d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "reproducible-faketools-tar"

RDEPENDS:${PN} += "/usr/bin/sh \
reproducible-faketools \
tar"

inherit rpm
