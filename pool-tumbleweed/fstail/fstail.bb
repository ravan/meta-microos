SUMMARY = "Scan a directory for changed files and tail them"
DESCRIPTION = "fstail - scan a directory for changed files and tail them \
 \
When you need to see the output from all changed files within a directory. \
Why doesn't tail -f /var/logs/* work? \
 \
Unfortunately, tail -f /logs/* may not do what you want it to do. Bash will \
expand * to all existing files within /logs/ and then show the extra lines \
added to each of them. \
 \
It also will not recurse down, any levels deeper than the current directory. \
How is fstail different then? \
 \
fstail uses the gopkg.in/fsnotify to detect both new files, and existing files \
that are changed. It then starts concatenting their contents to the terminal."
LICENSE = "MIT"

PV = "0.1.0"

RPM_NAME = "fstail-0.1.0-1.13.aarch64.rpm"
RPM_HASH = "4d82c363ddf8b6af5983886846722b84564c9d42849a2a422ae384df150fcef089cd3880d1a7f0bc1d4cf498d119e0cb32680d599733c504b5f9fe6424e4b47e"

RPROVIDES:${PN} += "fstail"

RDEPENDS:${PN} += ""

inherit rpm
