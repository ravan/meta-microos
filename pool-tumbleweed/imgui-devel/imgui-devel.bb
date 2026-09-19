SUMMARY = "Development files for ImGui"
DESCRIPTION = "ImGui is self-contained within a few files that you can easily copy and compile \
into your application/engine. \
 \
No specific build process is required. You can add the .cpp files to your \
project or #include them from an existing file."
LICENSE = "MIT"

PV = "1.92.7"

RPM_NAME = "imgui-devel-1.92.7-1.2.aarch64.rpm"
RPM_HASH = "28debf6c84549d08284f84021313f6968d31854753137608a3f088ea08bace82fe70299f542c23b1b7ea97dfa4204d5bc9ea0bfe1437d42edbbe87034de42782"

RPROVIDES:${PN} += "imgui-devel"

RDEPENDS:${PN} += ""

inherit rpm
