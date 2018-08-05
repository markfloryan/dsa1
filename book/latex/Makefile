textbook:
	pdflatex main
	makeindex main.idx -s StyleInd.ist
	biber main
	pdflatex main x 2
	rm *.log *.aux *.bcf *.ptc *.run.xml *.ilg *.blg *.toc

