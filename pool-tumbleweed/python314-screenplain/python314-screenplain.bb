SUMMARY = "Convert text file to viewable screenplay"
DESCRIPTION = "Screenplain allows you to write a screenplay as a plain text \
file using a format called Fountain. Text files are simple \
and supported by all text manipulation software. It's not \
just for hackers, too. The simplicity of plain text allows \
you to easily view and edit them on devices such as tablets \
and phones. No need for specific screenwriting software. \
 \
The magic that Screenplain performs is to take your plain \
text file and convert it to a good looking screenplay in an \
industry standard format. Send that file off to your producer, \
agent, director or screenwriting competition. Currently, the \
supported output formats are FDX and HTML. PDF will hopefully \
be supported in a not too distant future."
LICENSE = "MIT"

PV = "0.11.1+git.1701424578.13b79f2"

RPM_NAME = "python314-screenplain-0.11.1+git.1701424578.13b79f2-1.11.noarch.rpm"
RPM_HASH = "994490cb11c931aa33306f6626ac0ce0242f707d475de1563b5b0b8578e623974e544a3a71e016e0409c20499b09d7182065ca2fe5e4bdd5080f2a32b148558b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-screenplain \
python314-screenplain \
python3dist-screenplain"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
python-abi \
python314-reportlab \
update-alternatives"

inherit rpm
