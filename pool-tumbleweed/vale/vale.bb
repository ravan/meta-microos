SUMMARY = "CLI tool to lint text with extensible markup format support"
DESCRIPTION = "Vale is a command-line tool that brings code-like linting to prose. It's fast, \
cross-platform (Windows, macOS, and Linux), and highly customizable. \
 \
Vale has support for markup: Vale has a rich understanding of many markup \
formats, allowing it to avoid syntax-related false positives and intelligently \
exclude code snippets from prose-related rules. \
 \
Vale includes a highly customizable extension system capable of enforcing your \
style-be it a standard editorial style guide or a custom in-house set of rules \
(such as those created by GitLab, Homebrew, Linode, CockroachDB, and Spotify). \
 \
https://vale.sh/"
LICENSE = "MIT"

PV = "3.17.1"

RPM_NAME = "vale-3.17.1-1.1.aarch64.rpm"
RPM_HASH = "01f6e603139bee30a66aa3829bfda7ae3eaf0d887f172813442a8fb76a3cf434e2f723f8d8316326f8853679969e3ffb3d3d1d1477573e512c3ca2acb4ff6296"

RPROVIDES:${PN} += "vale"

RDEPENDS:${PN} += "libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
