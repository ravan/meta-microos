SUMMARY = "ExDoc produces HTML and online documentation for Elixir projects"
DESCRIPTION = "ExDoc is a tool to generate documentation for your Elixir projects. In case you \
are looking for documentation for Elixir itself, check out Elixir's website."
LICENSE = "Apache-2.0 & MIT"

PV = "0.40.3"

RPM_NAME = "ex_doc-0.40.3-1.1.aarch64.rpm"
RPM_HASH = "c298c31fc037ba89400b77162f4a22c630c8bfc82bf84a7551be7232537bdbccd2beeb02d6b9bd0db2b90b22096df9b6fcd88555dd3b5d2e8608c30b2919d471"

RPROVIDES:${PN} += "elixir-ex-doc \
ex-doc"

RDEPENDS:${PN} += "/usr/bin/escript"

inherit rpm
