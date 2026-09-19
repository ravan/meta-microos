SUMMARY = "CLI tool and REPL for working with binary data inspired by jq"
DESCRIPTION = "fq is inspired by the well known jq tool and language and allows you to work \
with binary formats the same way you would using jq. In addition it can present \
data like a hex viewer, transform, slice and concatenate binary data. It also \
supports nested formats and has an interactive REPL with auto-completion."
LICENSE = "MIT"

PV = "0.18.0"

RPM_NAME = "fq-0.18.0-1.1.aarch64.rpm"
RPM_HASH = "0e9df865efd171ab6736029011b3399d118f2f9f4aa9934f93f1e239e42ad8fdd7cf70d0ef7fe5745111ce1395a4e1e7c54329f118b72d74f18c516b4ec94036"

RPROVIDES:${PN} += "fq"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
