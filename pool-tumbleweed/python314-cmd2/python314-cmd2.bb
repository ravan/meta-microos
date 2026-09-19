SUMMARY = "Extra features for standard library's cmd module"
DESCRIPTION = "Enhancements for standard library's cmd module. \
 \
Drop-in replacement adds several features for command-prompt tools: \
 \
    * Searchable command history (commands: 'hi', 'li', 'run') \
    * Load commands from file, save to file, edit commands in file \
    * Multi-line commands \
    * Case-insensitive commands \
    * Special-character shortcut commands (beyond cmd's '@' and '!') \
    * Settable environment parameters \
    * Parsing commands with flags \
    * > (filename), >> (filename) redirect output to file \
    * < (filename) gets input from file \
    * bare >, >>, < redirect to/from paste buffer \
    * accepts abbreviated commands when unambiguous \
    * `py` enters interactive Python console \
    * test apps against sample session transcript (see example/example.py)"
LICENSE = "MIT"

PV = "4.2.0"

RPM_NAME = "python314-cmd2-4.2.0-1.1.noarch.rpm"
RPM_HASH = "300e2eb59816d2840852e9e7bfb4a06c6dc40b9811251a8da7bee5db6b9db2d7da9fa4725c2d5cdbb80037592143d9b40480bd225e6ab3216b3c00e441350210"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-cmd2 \
python314-cmd2 \
python3dist-cmd2"

RDEPENDS:${PN} += "python-abi \
python314 \
python314-prompt-toolkit \
python314-pyperclip \
python314-rich \
python314-rich-argparse"

inherit rpm
