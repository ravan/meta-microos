SUMMARY = "Support for multiple-weight font packages"
DESCRIPTION = "Many font families available for use with LaTeX are available \
at multiple weights. Many Type 1-oriented support packages for \
such fonts re-define the standard \\mddefault or \\bfdefault \
macros. This can create difficulties if the weight desired for \
one font family isn't available for another font family, or if \
it differs from the weight desired for another font family. The \
package provides a solution to these difficulties."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn77682"

RPM_NAME = "texlive-mweights-2026.226.svn77682-61.2.noarch.rpm"
RPM_HASH = "047391303a731fafde3a3b98b99ac14c27712200238b1518347de889aff62fd8ee1cce9cc0677502bb81f2bb5119cf56a9cac9d276baafb89af1a37d3952c87d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-mweights.sty \
texlive-mweights"

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
