SUMMARY = "Intelligent cross-referencing"
DESCRIPTION = "The package enhances LaTeX's cross-referencing features, \
allowing the format of references to be determined \
automatically according to the type of reference. The formats \
used may be customised in the preamble of a document; babel \
support is available (though the choice of languages remains \
limited: currently Danish, Dutch, English, French, German, \
Italian, Norwegian, Russian, Spanish and Ukrainian). The \
package also offers a means of referencing a list of \
references, each formatted according to its type. In such \
lists, it can collapse sequences of numerically-consecutive \
labels to a reference range."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.21.4svn77682"

RPM_NAME = "texlive-cleveref-2026.226.0.0.21.4svn77682-60.2.noarch.rpm"
RPM_HASH = "875c88e1fb6cc8f9cd7abf31adf4a232f231758671c68fa2dbf301fd9945b3ab05cfa92faa24f64ae24d8db7e0a54906aa89d4419e4f763dcf2433a150d7ed08"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-cleveref.sty \
texlive-cleveref"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
