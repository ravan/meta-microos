SUMMARY = "Extract parts of a document and write to another document"
DESCRIPTION = "The package provides the means to extract specific content from \
a source document and write that to a target document. One \
could, for instance, use this to extract all exercises from \
lecture notes and generate an exercises book on the fly. The \
package also provides an environment which writes its body \
entirely to the target file. Another environment will write to \
the target file, but will also execute the body. This allows to \
share code (for instance, a preamble) between the source \
document and the target file. Finally, the package provides an \
interface to conditionally extract content. With a single \
package option, one can specify exactly which commands (counted \
from the start of the document) should be extracted and which \
not. This might be useful for extracting specific slides from a \
presentation and use them in a new file."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.9asvn52117"

RPM_NAME = "texlive-extract-2026.226.1.9asvn52117-59.2.noarch.rpm"
RPM_HASH = "d8aeac0bb6c3905a73208793e372a87275839f91fae56ffb4ecde88d4b17bba922ee690032860ad7f9bc2a59798dbf6d5f4069ea31a0da56510551021634ef5a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-extract.sty \
texlive-extract"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-verbatim.sty \
tex-xkeyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
