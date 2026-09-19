SUMMARY = "Browse a Subversion Repository with a Web Browser"
DESCRIPTION = "ViewVC is a browser interface for CVS and Subversion version control \
repositories. It generates templatized HTML to present navigable \
directory, revision, and change log listings. It can display specific \
versions of files as well as diffs between those versions. Basically, \
ViewVC provides the bulk of the report-like functionality you expect \
out of your version control tool, but much prettier than the average \
textual command-line program output. \
 \
ViewVC is the successor of ViewCVS."
LICENSE = "BSD-2-Clause"

PV = "1.3.0~dev20250722"

RPM_NAME = "viewvc-1.3.0~dev20250722-1.5.noarch.rpm"
RPM_HASH = "5aeefd997256b27450936fba1bad9c29b92ac28021563d254224afbfc33cb21a5a708e9768d118eaab296c6e487853ff09aaefc74c3aca4b89eb181ab25ca006"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-viewvc \
subversion-viewcvs \
viewcvs \
viewvc"

RDEPENDS:${PN} += "/usr/bin/python3 \
python3-legacy-cgi \
subversion-python"

inherit rpm
