SUMMARY = "A tool for automatically generating markdown documentation for helm charts"
DESCRIPTION = "The helm-docs tool auto-generates documentation from helm charts into markdown files. The resulting files contain metadata about their respective chart and a table with each of the chart's values, their defaults, and an optional description parsed from comments. \
 \
The markdown generation is entirely gotemplate driven. The tool parses metadata from charts and generates a number of sub-templates that can be referenced in a template file (by default README.md.gotmpl). If no template file is provided, the tool has a default internal template that will generate a reasonably formatted README."
LICENSE = "GPL-3.0-only"

PV = "1.14.2"

RPM_NAME = "helm-docs-1.14.2-1.14.aarch64.rpm"
RPM_HASH = "1f8fba326dd131d67922db6a7498c7f5fd5619aa5fee7ff84ca1b4f0748d0425fc81a16343459464aed4bc3994da84ea7da1680a9c0a5c7a37ea1f5cd2bfda79"

RPROVIDES:${PN} += "helm-docs"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
